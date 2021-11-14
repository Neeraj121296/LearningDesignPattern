/******************************************************************************

Design Pattern :
Factory design Pattern (Creational design patterm)
Outsourcing the task for creation of object to some other entity
*******************************************************************************/

interface Os{
    
    public void spec();
}

class Android implements Os{
    @Override
    public void spec(){
        System.out.println("Welcome to Android world");
    }
}

class Ios implements Os{
    @Override
    public  void spec(){
        System.out.println("Welcome to Ios world");
    }
}
class Windows implements Os{
    @Override
    public void spec(){
        System.out.println("Welcome to Windows world");
    }
}

class ObjectCreationFactory{
    
    public static Os getInstance(String type){
        
        if(type.equals("open"))
            return new Android();
        else if(type.equals("secured"))    
            return new Ios();
        else
            return new Windows();
        
    }
}

public class FactoryDesign
{
	public static void main(String[] args) {
	    Os obj=ObjectCreationFactory.getInstance("secured");
	    obj.spec();
	}
}
