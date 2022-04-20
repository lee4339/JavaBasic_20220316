package j18_제네릭;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Message<T, V> {
	private T code;
	private V data;
}
