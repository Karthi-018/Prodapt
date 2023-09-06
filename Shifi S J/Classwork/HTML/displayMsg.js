function displayMsg()
{
    let uname=document.getElementById("uname").value;
    let pwd=document.getElementById("pwd").value;
    if (uname=="Admin" & pwd=="Reset@123")
    {
        swal("Welcome "+uname," ","success")
    }
    else
        {
            swal("Password/Username incorrect"," ","error")
        }
}