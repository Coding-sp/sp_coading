class room{
    float length;
    float breath;
    void getdata(float a,float b){
        length=a;
        breath=b;
    }  
}

class squre{
    float length;
    void getdata(float a){
        length=a;  
    }  
}
class roomArea{
    public static void main(String[] args){
        float area;
        room room1=new room();
        room1.getdata(14, 10);
        area = room1.length * room1.breath;
        System.out.println("area is="+area);

        squre room2=new squre();
        float area2;
        room2.getdata(10);
        area2=room2.length*room2.length;
        System.out.println("room2 area is="+area2);
        
    }

}