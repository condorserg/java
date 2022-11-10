package module8.t01.t03;




public interface PrintText {

    public default void print(String str){
        System.out.println(str);
    };

}
