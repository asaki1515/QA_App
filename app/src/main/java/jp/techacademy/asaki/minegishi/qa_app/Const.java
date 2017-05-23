package jp.techacademy.asaki.minegishi.qa_app;

// 定数を定義するConstクラス。複数のクラスから使う定数がある場合はこのようなクラスを用意すると便利。
public class Const {
    public static final String UsersPATH = "users"; // Firebaseにユーザの表示名を保存するパス
    public static final String ContentsPATH = "contents"; // Firebaseに質問を保存するバス
    public static final String AnswersPATH = "answers"; // Firebaseに解答を保存するパス

    public static final String NameKEY = "name"; // Preferenceに表示名を保存する時のキー
}
