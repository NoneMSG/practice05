package prob5;

public class MyStack<T> {
	int top;
	public String[] buffer;
	MyStack(){}
	
	MyStack(int value){
		this.top=0;
		this.buffer = new String[value];
	}
	
	public void push(String string) {
		
		if(top==buffer.length){
			resize(); 
		}else{
			this.buffer[top++] = string;
		}
	}
	public String pop()throws MyStackException{
		if(isEmpty()){throw new MyStackException("stack is empty");}
		return this.buffer[--top];
	}
	public boolean isEmpty(){ 
		boolean flag = true;
		
		if(top<=0){
			flag=true;
		}else{
			flag =false;
		}
		return flag;
	}
	private void resize(){
		String[] tempBuff = new String[buffer.length*2];
		for(int i = 0 ; i <this.buffer.length ; ++i){
			tempBuff[i] = this.buffer[i];
		}
		this.buffer = new String[buffer.length*2];
		for(int i = 0 ; i <tempBuff.length ; ++i){
			this.buffer[i] = tempBuff[i];
		}
	}
	
}
