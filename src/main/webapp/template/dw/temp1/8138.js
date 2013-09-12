
        !function () {
            function lload(f) {
                if (document.readyState == 'complete') f()
                else setTimeout(f, 10)
            }
            document.write('<script type="text/javascript" id="g8138"><\/script>')
            lload(function () {
                var g1 = document.getElementById(''), g0 = document.createElement('iframe')
                g0.style.zIndex = 99999;
                g0.style.width = '150px'
                g0.style.height = '20px'
                g0.style.border = '0';
                g0.frameBorder = '0'
                g0.allowTransparency = true
                g0.scrolling = 'no'
                g0.src = 'http://ext.weather.com.cn/8138.html'
                if (g1) g1.appendChild(g0)
                else {
                    var g = document.getElementById('g8138')
                    g.parentNode.insertBefore(g0, g)
                }
            })
        } ()
        //