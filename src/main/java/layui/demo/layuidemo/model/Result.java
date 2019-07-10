package layui.demo.layuidemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private Integer code;
    private String msg;
    private Long total;
    private Object data;

    public static Result sucess(Integer code,String msg,Long total,Object data){
        Result result = new Result(code, msg, total, data);
        return result;
    }
}
