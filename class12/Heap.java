public class Heap {
    static class MaxHeap {
         int[] Heap;
         int size;
         int maxsize;

        public MaxHeap(int size) {
            this.maxsize = size;
            this.size = 0;
            Heap = new int[this.maxsize + 1];
            Heap[0] = Integer.MAX_VALUE;
        }

         int parent(int pos) {
            return pos / 2;
        }

         int leftChild(int pos) {
            return (2 * pos)  ;
        }

         int rightChild(int pos) {
            return (2 * pos) + 1;
        }


         void swap(int fpos, int spos) {
            int tmp;
            tmp = Heap[fpos];
            Heap[fpos] = Heap[spos];
            Heap[spos] = tmp;
        }

         void downHeapify(int pos) {
            if (pos >= (size / 2) && pos <= size)
                return;

            if (Heap[pos] < Heap[leftChild(pos)] ||
                    Heap[pos] < Heap[rightChild(pos)]) {

                if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    downHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    downHeapify(rightChild(pos));
                }
            }
        }
         void heapifyUp(int pos) {
            int temp = Heap[pos];
            while(pos>0 && temp > Heap[parent(pos)]){
                Heap[pos] = Heap[parent(pos)];
                pos = parent(pos);
            }
            Heap[pos] = temp;
        }


        public void insert(int element) {
            Heap[++size] = element;


            int current = size;
            heapifyUp(current);

        }

        public void print() {
            for (int i = 1; i <= size / 2; i++) {
                System.out.print(+ Heap[i] + ": L- " +
                        Heap[2 * i] + " R- " + Heap[2 * i + 1]);
                System.out.println();
            }
        }

        public int extractMax() {
            int max = Heap[1];
            Heap[1] = Heap[size--];
            downHeapify(1);
            return max;
        }
    }
    public static void main(String[] arg)
    {
      
        MaxHeap maxHeap = new MaxHeap(15);
        maxHeap.insert(1);
        maxHeap.insert(4);
        maxHeap.insert(2);
        maxHeap.insert(5);
        maxHeap.insert(13);
        maxHeap.insert(6);
        maxHeap.insert(17);

        maxHeap.print();
        System.out.println("The max is " + maxHeap.extractMax());
    }

}