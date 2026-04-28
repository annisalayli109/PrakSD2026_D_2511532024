package pekan4_2511532024;

public class QueueArray_2511532024 {
	int front_2024, rear_2024, size_2024;
	int capacity_2024;
	int array_2024[];
	
	public QueueArray_2511532024(int capacity) {
		this.capacity_2024 = capacity;
		front_2024 = this.size_2024 = 0;
		rear_2024 = capacity - 1;
		array_2024 = new int [this.capacity_2024];
	}
	
	boolean isFull(QueueArray_2511532024 queue) {
		return (queue.size_2024 == queue.capacity_2024);
	}
	
	boolean isEmpty(QueueArray_2511532024 queue) {
		return (queue.size_2024 == 0);
	}
	
	void enqueue (int item) {
		if (isFull(this))
			return;
		this.rear_2024 = (this.rear_2024 + 1) % this.capacity_2024;
		this.array_2024[this.rear_2024] = item;
		this.size_2024 = this.size_2024 + 1;
		System.out.println(item + " enqueued to queue");
	}

	int dequeue_2024() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array_2024[this.front_2024];
		this.front_2024 = (this.front_2024 + 1) % this.capacity_2024;
		this.size_2024 = this.size_2024 - 1;
		return item;
	}
	
	int front_2024() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2024[this.front_2024];
	}
	
	int rear_2024() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2024[this.rear_2024];
	}
	
	// mencetak elemen antrian
	void display_2024() {
		int i;
		if(front_2024 == rear_2024) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		
		// kunjungi dari belakang dan cetak
		for (i = front_2024; i < rear_2024; i++) {
			System.out.printf(" %d <-- ", array_2024[i]);
		}
		return;
	}
}
