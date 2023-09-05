function display()
{
    let num1=parseInt(document.getElementById("1st").value);
    console.log(num1);
    let num2=parseInt(document.getElementById("2nd").value);
    let operator=document.querySelector("input[type=radio]:checked").value;
    if(operator==("Add"))
    {
        swal("result = "+(num1+num2));
    }
    else if(operator==("Sub"))
    {
        swal("result"+(num1-num2));
    }
    else if(operator==("Mul"))
    {
        swal("result"+(num1*num2));
    }
    else if(operator==("Div"))
    {
        swal("result"+(num1/num2));
    }
    else if(operator==("Mod"))
    {
        swal("result"+(num1%num2));
    }
    else{
        swal(result);
    }
}
