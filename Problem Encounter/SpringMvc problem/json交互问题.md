   415报错
   这个主要是数据类型不匹配的问题，在form表单中如果调用js来传递的话，在action中就不用加处理路径，否则会造成415错误
 2.JSON
 json对象：{"text":"text"}
 json串:'{"text":"text"}'
 在ajax中使用json对象或串都可以，但在Springmvc中只能接受json串，所以用JSON.stringify()来处理
 3.在springmvc中，json串可以自动装配到bean中
