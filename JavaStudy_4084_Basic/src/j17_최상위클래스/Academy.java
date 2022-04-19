package j17_최상위클래스;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor //기본생성자
@AllArgsConstructor //전체생성자
@Data
public class Academy {
	private String name; // 코리아아이티아카데미
	private String address; // 부산지점
	private String subject; // IT
	
}
