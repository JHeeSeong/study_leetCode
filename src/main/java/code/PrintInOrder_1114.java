package code;

public class PrintInOrder_1114 {
    public static void main(String[] args) {
    }

    class Foo {
        private volatile int flag;

        public Foo() {
        }

        public void first(Runnable printFirst) throws InterruptedException {
            printFirst.run();
            flag++;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (flag == 0) {
                continue;
            }
            printSecond.run();
            flag++;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (flag < 2) {
                continue;
            }
            printThird.run();
            flag++;
        }
    }
}
