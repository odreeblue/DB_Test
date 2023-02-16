radios.forEach(function(radio){
    radio.removeEventListener('change',function(event){
    var modules=document.querySelector('li');
    alert(event.target.id);
    });
});


// click은 안됨
// radios.forEach(function(radio){
//     radio.removeEventListener('click',function(event){
//     var modules=document.querySelector('li');
//     alert(event.target.id);
//     });
// });

var radios = document.querySelectorAll('input[type="radio"][name="systemID"]');
radios.forEach(function(radio){
    radio.addEventListener('change',function(event){
    var modules=document.querySelector('li');
    console.log(event.target.id);
    alert(event.target.id);
    if(event.target.id =='sys1' || event.target.id =='sys2'){
        modules.forEach(function(module,index){
            console.log("module.inner_HTML: "+module.inner_HTML);
            console.log("index: "+index);
            module.inner_HTML=sys_1OR2_module[index];
        });
    }
    });
});


var modules=document.querySelectorAll('li');
modules.forEach(function(module,index){
    console.log(module.innerText);
    console.log(sys_3OR4_module[index]);
    module.innerText = sys_3OR4_module[index];
});


var radios = document.querySelectorAll('input[type="radio"][name="systemID"]');
radios.forEach(function(radio){
    radio.addEventListener('change',function(event){
    console.log(event.target.id == 'sys1');
    console.log(event.target.id == 'sys2');
    console.log(event.target.id == 'sys3');
    console.log(event.target.id == 'sys4');
    
    });
});

let str = '<input class=\"form-check-input me-1\" type=\"checkbox\" value=\"\" aria-label=\"...\">'
var radios = document.querySelectorAll('input[type="radio"][name="systemID"]');
radios.forEach(function(radio){
    radio.addEventListener('change',function(event){
    if(event.target.id=='sys1' || event.target.id=='sys2'){
        console.log("1번 혹은 2번");
    }else{
        console.log("3번 혹은 4번");
    }
    });
});

var radios = document.querySelectorAll('input[type="radio"][name="systemID"]');
var modules = document.querySelectorAll('li');
radios.forEach(function(radio){
    
    radio.addEventListener('change',function(event){
    if(event.target.id=='sys1' || event.target.id=='sys2'){
        modules.forEach(function(module,index){
            module.innerText=str.concat(sys_1OR2_module[index]);
        });
    }else{
        modules.forEach(function(module,index){
            module.innerText=str.concat(sys_3OR4_module[index]);
        });
    }
    });
});


    var sys_1OR2_module = ["Cooling Water", "Engine", "Cylinders","Exhaust Gas", "Fuel Oil",
                            "Gearbox Oil", "Generator", "Lub.Oil","---"];
    var sys_3OR4_module = ["Cabinet C.Water1", "Cabinet C.Water2", "Convertor1","Convertor2",
                            "Main Shaft", "Motor1", "Motor2", "VSD M1 Status","VSD M2 Status"];
    sys_module = []

    var radios = document.querySelectorAll('input[type="radio"][name="systemID"]');
    var modules = document.querySelectorAll('li');
    let stri = '<input class=\"form-check-input me-1\" type=\"checkbox\" value=\"\" aria-label=\"...\">'

    radios.forEach(function(radio){
        radio.addEventListener('change',function(event){
            if(event.target.id=='sys1' || event.target.id=='sys2'){
                modules.forEach(function(module,index){
                    module.innerHTML=str+sys_1OR2_module[index];
                });
            }else{
                modules.forEach(function(module,index){
                    module.innerHTML=str+sys_3OR4_module[index];
            });
            }
        });
    });