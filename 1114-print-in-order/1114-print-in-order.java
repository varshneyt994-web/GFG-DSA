import java.util.concurrent.Semaphore;

class Foo {

    Semaphore second = new Semaphore(0);
    Semaphore third = new Semaphore(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        printFirst.run();
        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        second.acquire();
        printSecond.run();
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        third.acquire();
        printThird.run();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna