
public class ArrayMain07 {

	public static void main(String[] args) {
		
		if(args.length > 0) { //ArraytMain07을 실행하면서 외부에서 
						//전달한 데이터가 있을 경우, args가 가리키는 배열에 담겨있음
			for(int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		
		}else { //ArrayMain07을 실행하면서 외부에서 전달한 데이터가 없을 때
			System.out.println("입력한 내용이 없습니다.");
		}
		
		
		
		
		
		
		
	}

}
