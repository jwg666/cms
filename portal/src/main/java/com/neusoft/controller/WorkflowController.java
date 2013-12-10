package com.neusoft.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
//import java.util.List;
//import java.util.Map;
import java.util.zip.ZipInputStream;

import javax.annotation.Resource;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
//import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/workflow")
public class WorkflowController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	protected RepositoryService repositoryService;
	@Resource
	protected RuntimeService runtimeService;
	@Resource
	protected TaskService taskService;   
	@Resource
	protected HistoryService historyService;
	@Resource
	protected IdentityService identityService;
	
	private File processFile;
//	private String processInstanceId;
	private String processFileFileName;
//	private String deploymentId;
//	private String resourceName;
//	private InputStream resourceAsStream;
//	private String[] deploymentIds;
//	private List<Map<String, Object>> activityInfos;
//	private List<ActivityImpl> activitiList;
//	private String taskId;
//	private String taskKey;
	/* 流程的状态 */
//	private String state;
//	private String processDefinitionName;

	
//	private String key;
//	private String processDefinitionId;
	
	@RequestMapping("/deploy")
	public String deploy() {
		InputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(processFile);

			String extension = FilenameUtils.getExtension(processFileFileName);
			if (extension.equals("zip") || extension.equals("bar")) {
				ZipInputStream zip = new ZipInputStream(fileInputStream);
				repositoryService.createDeployment().addZipInputStream(zip).deploy();
			} else {
				repositoryService.createDeployment().addInputStream(processFileFileName, fileInputStream).deploy();
			}
		} catch (FileNotFoundException e) {
			logger.error("got exception--", e);
		}		
		return "workflow";
	}
}
