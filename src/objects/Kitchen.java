package objects;

public class Kitchen {

     Dishwasher dishwasher;
     Oven oven;
     Refigerator refigerator;
     Sink sink;

     public Kitchen(Dishwasher dishwasher, Oven oven, Refigerator refigerator, Sink sink) {
          this.dishwasher = dishwasher;
          this.oven = oven;
          this.refigerator = refigerator;
          this.sink = sink;
     }

     public Dishwasher getDishwasher() {
          return dishwasher;
     }

     public void setDishwasher(Dishwasher dishwasher) {
          this.dishwasher = dishwasher;
     }

     public Oven getOven() {
          return oven;
     }

     public void setOven(Oven oven) {
          this.oven = oven;
     }

     public Refigerator getRefigerator() {
          return refigerator;
     }

     public void setRefigerator(Refigerator refigerator) {
          this.refigerator = refigerator;
     }

     public Sink getSink() {
          return sink;
     }

     public void setSink(Sink sink) {
          this.sink = sink;
     }

     @Override
     public String toString() {
          return "Kitchen{" +
                  "dishwasher=" + dishwasher +
                  ", oven=" + oven +
                  ", refigerator=" + refigerator +
                  ", sink=" + sink +
                  '}';
     }
}
