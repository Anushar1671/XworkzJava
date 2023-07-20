class Idol {


String name;

Idol ()
{
System.out.println("invoking no-arf of Idol");
System.out.println("Name in const "+this.name);
this.name="BTS";//intialize instance variable 
}

Idol (String name){
System.out.println("invoking no-arf of Idol");
this.name=name;  
}
}




