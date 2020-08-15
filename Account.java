public class Account {
  String accountNo;

  // equals()のオーバーライド
  public boolean equals(Object o) {
    // 自分自身が引数として渡された場合true
    if (o == this) return true;
    // nullが引数として渡されてきた場合false
    if (o == null) return false;
    // 比較し型が異なるならばfalse
    if (!(o instanceof Account)) return false;
    Account r = (Account) o;
    // ２つのインスタンスが持つしかるべきフィールド同士を比較して等価か判定
    if (!this.accountNo.trim().equals(r.accountNo.trim())) {
      return false;
    }
    return true;
  }
}