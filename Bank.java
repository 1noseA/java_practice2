// import org.apache.commons.lang3.builder.*;

// public class Bank {
//   String name;
//   String address;

//   // この一行だけで「全てのフィールドが等価ならインスタンスも等価とみなす」
//   public boolean equals(Object o) {
//     return EqualsBuilder.reflectionEquals(this, o);
//   }

//   // この一行だけでハッシュ値を生成できる
//   public int hashCode() {
//     return HashCodeBuilder.reflectionHashCode(this);
//   }
// }