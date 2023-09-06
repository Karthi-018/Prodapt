let ticket=prompt('Enter the ticket count')

if(ticket==0){

    alert("Invalid Entry")

    let res=confirm('Exit')

    if(res!=true){

        con();

    }
  

}

else if(ticket>10){

    alert("please enter less than 10 tickets ");

    let res=confirm('Exit')

    if(res!=true){

        con();

    }

}

else if(ticket>1 && ticket<10){

    alert(ticket*150);

    console.log(ticket*150)

    let res=confirm('Exit')

    if(res!=true){

        con();

    }
}
function con(){

    let ticket=prompt('Enter the ticket count')

if(ticket==0){

    alert("Invalid Entry")
}
else if(ticket>10){

    alert("please enter less than 10 tickets ");

}
else{

    alert(ticket*150);

    console.log(ticket*150)
}
}