package homework2.InnerClasses.PrivateMembersAccess;

public class ClassTwo {
    int iAmEasyToGet;
    public ClassTwo() {
        iAmEasyToGet = 0;
    }

    void test(){}

    public class InsideClass{
        int getMe;

        public void test(){

            System.out.println(iAmEasyToGet);

        }

        public InsideClass(int getMe) {
            this.getMe = getMe;

        }
    }
}
