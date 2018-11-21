package homework2.InnerClasses.PrivateMembersAccess;

public class ClassOne {
    int iAmEasyToGet;
    public ClassOne() {
        iAmEasyToGet = 0;
    }

    public void test(){
        InsideClass temp = new InsideClass(1);
        temp.print();
    }
    class InsideClass{
        int getMe;

        public InsideClass(int getMe) {
            this.getMe = getMe;

        }
        public void print(){
            System.out.println(getIAmEasyToGet());
        }

        public int getIAmEasyToGet() {
            return iAmEasyToGet;
        }
    }
}
