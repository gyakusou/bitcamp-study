function jQuery(selector) {
  if (selector.startsWith('<')) {
    var tagName = selector.substring(1, selector.length - 1);
    var el = [document.createElement(tagName)];
  } else {
    var el = document.querySelectorAll(selector);
  }
  
  el.html = function(value) {
    if (arguments.length == 0) {
      return this[0].innerHTML;
    }
    for (var e of el) {
      e.innerHTML = value;
    }
    return this;
  };
  
  el.addClass = function(value) {
	    if (arguments.length == 0) {
	      return this[0].innerHTML;
	    }
	    for (var e of el) {
	      e.className = e.className + "" + value;
	    }
	    return this;
	  };
  
  el.css = function(name, value) {
    if (arguments.length == 0) {
      return;
    }
    
    if (arguments.length == 1) {
      return this[0].style[name];
    }
    
    for (var e of el) {
      e.style[name] = value;
    }
    return this;
  };
  
  el.on = function(event, p1, p2) {
    if (arguments.length < 2) {
      return;
    }
    
    // 예) on('click', () = > {})
    // 파라미터가 두개 넘어온다면, 두번째 파라미터(p1)는 리스너이다.
    if (arguments.length == 2) {
    	for (var e of el) {
    		e.addEventListener(event, p1);
    	}
    } else {
    	for (var element of el) {
    		element.addEventListener(event, (e) => {
    			// 부모의 자식 중에서 파라미터에서 지정한 셀렉터일 경우에만 
    			// 리스너를 호출한다.
    			// 1. 먼저 현재 부모의 자식 중에서 셀렉터에 소속되어 있는 
    			// 태그를 찾는다.
    			var targets = element.querySelectorAll(p1);
    			
    			// 2. 이벤트가 발생한 태그가 셀렉터에서 지정한 태그일 경우에만
    			// 리스너를 호출한다.
    			for (var target of targets) {
    				if(e.target == target) {
    					p2(e);
    				}
    			}
    		});
    	}
    }
    return this;
  };
  
  el.click = function(listener) {
    if (arguments.length < 1) {
      return;
    }
    
    this.on('click', listener);
    return this;
  }
  
  el.append = function(childs) {
    if (arguments.length < 1) {
      return;
    }
    
    for (var e of el) {
      for (var child of childs) {
        e.appendChild(child);
      }
    }
    return this;
  }
  
  el.appendTo = function(parents) {
    if (arguments.length < 1) {
      return;
    }
    
    for (var e of parents) {
      for (var child of el) {
        e.appendChild(child);
      }
    }
    return this;
  }
  
  return el;
};

var $ = jQuery;