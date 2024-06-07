package PraticeAccessModifiers;

public class AccessModifiers {
    private int _Private=13;
    public String _Public="Public Variable String From Another Package";
    protected char _Protect='A';
    int _default=100;
    protected void Private(){
        System.out.println("private Variable from Another Package: "+_Private);
        System.out.println("Default variable from Another Package: "+_default);
    }
}
//Default access through same package and different Class
class Access{
    void sample(){
        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj._Public);
        System.out.println(obj._Protect);
        System.out.println(obj._default);
    }
}