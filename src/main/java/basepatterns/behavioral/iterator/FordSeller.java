package basepatterns.behavioral.iterator;

public class FordSeller implements Collection{
    private String name;
    private String [] duties;

    public FordSeller(String name, String[] duties) {
        this.name = name;
        this.duties = duties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDuties() {
        return duties;
    }

    public void setDuties(String[] duties) {
        this.duties = duties;
    }

    @Override
    public Iterator getIterator() {
        return new DutiesIterator();
    }

    private class DutiesIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < duties.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return duties[index++];
        }
    }
}
