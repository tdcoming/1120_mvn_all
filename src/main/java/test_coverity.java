import java.util.ArrayList;

public class test_coverity {
    private final Object myLock = new Object();
    public void TheCorrectWay() {
        synchronized(myLock) {
            /* ... some critical section ... */
        }
    }
    public void DontLockOnStringLiterals() {
        synchronized("") {}
    }

    String strLock = "";
    public void DontLockOnFieldsInitializedWStringLiterals() {
        synchronized(strLock) {
        }
    }

    public void DontLockOnInternedStrings(String someStr) {
        synchronized(someStr.intern()) {
        }
    }

    public void DontLockOnBoxedIntegers() {
        synchronized((Integer) 0) {
        }
    }

    public void DontLockOnBoxedIntegers2(int someVal) {
        synchronized((Integer) someVal) {
        }
    }

    public void DontLockOnFloatsOrDoubles() {
        synchronized((Float) 0.0f) {
        }
    }

    Integer intLock = 5;
    public void FieldBoxedInt() {
        synchronized(intLock) {
        }
    }

    public void DontLockOnObjectsThatCanOnlyBeAccessedByOneThread() {
        synchronized(new Object()) {
        }
    }

    ArrayList myList;
    public void DontMutateLockedFields(Object[] items) {
        if(myList == null) {
            myList = new ArrayList();
        }
        synchronized(myList) {
            for(Object item : items) {
                myList.add(item);
            }
        }
    }

    public void DontGuardAMutableFieldByLockingOnThatField() {
        synchronized(myList) {
            myList = new ArrayList();
            /* ... other critical section operations ... */
        }
    }
}
