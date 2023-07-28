class Vehicle
{
int tyre;
public void countTyre(int tyre)
{
System.out.println("Vehicle has \' n \' number of  tyres");
}}

class Car extends Vehicle
{
@Override
public void countTyre(int tyre)
{
System.out.println("Car has four tyres");
}
}

class Bike extends Vehicle
{
@Override
public void countTyre(int tyre)
{
System.out.println("Bike has two tyres");
}
}

class Lorry extends Vehicle
{
@Override
public void countTyre(int tyre)
{
System.out.println("Lorry has six tyres");
}
}