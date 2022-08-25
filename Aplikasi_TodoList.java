public class Aplikasi_TodoList {

    public static String [] model = new String[10];
    public static void main(String[] args) {
    testAddTodoList();
    }

    /**
     * menampilkan todo list
     */
    public static void showTodoList(){
        for (int i = 0; i < model.length ; i++) {
            var todo = model [i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void tesShowTodoList(){
        model[0]= "Pendahuluan";
        model[1]="Nomor dua";
        model[2]="Nomor Tiga";
        model[3]="Nomor Empat";

    showTodoList();
    }

    /**
     * menambahkan to do lis
     */
    public static void addTodoList(String todo){
    //cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length ; i++) {
            if(model[i]==null){
                //model masih ada yang kosong
                isFull= false;
                break;
            }
        }
    //jika penuh kita resize ukuran aray 2x lipat
        if (isFull) {
            var temp = model;
            model= new String [model.length * 2];
            for (int i = 0; i < temp.length; i++) {
                model[i]= temp [i];
            }
        }


    // tambahkan ke posisi yang aray-nya Null
        for (int i = 0; i < model.length; i++) {
            if (model[i]==null){
                model[i]= todo;
            break;
            }
        }
    }
    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh to do ke- "+i);
        }
        showTodoList();
    }

    /**
     * Menghapus to do list
     */
    public static boolean removeTodoList(Integer number){
    if ((number-1) >= model.length){
        return false;
    } else if (model[number-1]==null) {
        return false;
    } else {
        model[number-1]=null;
        return true;
        }
    }
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");

    }
    /**
     * Menampilkan view Show Todo Lis
     */
    public static void viewShowTodoList(){

    }
    public static void viewAddTodoList(){

    }

    public static void viewRemoveTodoList(){

    }

}
