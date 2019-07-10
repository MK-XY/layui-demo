package layui.demo.layuidemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    /**
     * 用户名
     */
    @NotEmpty(message = "用户名必须输入")
    @Pattern(regexp = "[\\u4e00-\\u9fa5_a-zA-Z0-6\\-\\.\\,]{4,10}",message = "用户名不是中英文大小写 0-6数字 _-.,格式或者长度不在4~10区间")
    private String name;

    /**
     * 性别
     */
    @NotNull(message = "性别必须输入")
    @Range(min = 0,max = 2)
    private Integer sex;

    /**
     * 年龄
     */
    @NotNull(message = "年龄必须输入")
    @Range(min = 0,max = 200)
    private Integer age;

    /**
     * 生日
     */
    @NotNull(message = "生日必须输入")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDay;

    /**
     * 爱好
     */
    private List<String> hobby;

    /**
     * 籍贯
     */
    @NotNull(message = "籍贯必须输入")
    private Integer birthplace;

    /**
     *头像
     */
    @NotEmpty(message = "头像必须上传")
    private String avatar;

    public void setHobby(Object value) {
        List<String> hobby = null;

        if ( value instanceof   String[] ){
            hobby = Arrays.asList((String[])value);
        }else if(value instanceof   String){
            if (((String) value).contains(",")){
                String[] split = ((String) value).split(",");
                hobby=Arrays.asList(split);
            }else {
                hobby=Arrays.asList((String) value);
            }
        }else if( value instanceof Collection<?>){
            hobby = (List<String>) value;
        }

        this.hobby = hobby;
    }
}
