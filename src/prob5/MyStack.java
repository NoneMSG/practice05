package prob5;

public class MyStack<T> {
	private int top;
	private String[] buffer;

	MyStack(int value){
		this.top=0;
		this.buffer = new String[value];
		
	}
	
	public void push(String string) {
		this.buffer[top++] = string;
		if(top==buffer.length-1){
			resize(); 
		}
	}
	public String pop()throws MyStackException{
		if(isEmpty()){throw new MyStackException("stack is empty");}
		String buf = this.buffer[--top];
		this.buffer[top]=null;
		return buf;
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
		this.buffer = new String[tempBuff.length];
		for(int i = 0 ; i <tempBuff.length ; ++i){
			this.buffer[i] = tempBuff[i];
		}
	}
	
}
