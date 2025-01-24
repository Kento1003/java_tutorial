// 演習問題
public class Cake_Sum {
    public static void main(String[] args) {
        // ケーキメニューリストを設定(定数)
        /* ケーキメニュー(String)
         * ケーキの価格(int)*/
        final String shortCake = "ショートケーキ";
        final int shortCakePrice = 320;

        final String montBlanc = "モンブラン";
        final int montBlancPrice = 350;

        final String chocolateCake = "チョコレートケーキ";
        final int chocolateCakePrice = 370;

        final String berryTart = "いちごのタルト";
        final int berryTartPrice = 400;

        final String cheeseCake = "チーズケーキ";
        final int cheeseCakePrice = 300;

        // 消費税設定
        final float tax = 0.08f;

        // 対象のケーキの名前を取得する
        String cakeName = "";
        // 対象のケーキの個数を取得する
        int cakeQuantity = 0;

        // ケーキの合計金額を取得
        int cakeSumPrice = 0;

        for (int i = 0; i < args.length; i += 2) {
            // 処理対象のケーキ名と個数を取得
            cakeName = args[i];
            cakeQuantity = Integer.parseInt(args[i + 1]);

            // 投入(要求された)ケーキに対し、名前と合計値段を取得する。
            switch (cakeName) {
                // ショートケーキ
                case shortCake:
                    cakeSumPrice += shortCakePrice * cakeQuantity;
                    break;
                // モンブラン
                case montBlanc:
                    cakeSumPrice += montBlancPrice * cakeQuantity;
                    break;
                // チョコレートケーキ
                case chocolateCake:
                    cakeSumPrice += chocolateCakePrice * cakeQuantity;
                    break;
                // いちごのタルト
                case berryTart:
                    cakeSumPrice += berryTartPrice * cakeQuantity;
                    break;
                // チーズケーキ
                case cheeseCake:
                    cakeSumPrice += cheeseCakePrice * cakeQuantity;
                    break;
                // 該当なしのメニューの場合
                default:
                    System.out.println(cakeName + "はメニューリストにないケーキです。名前を再確認してください。");
                    break;
            }
        }
        System.out.println("合計で" + cakeSumPrice + "円です。");

        // 1000円以上購入で、2割引を行う。
        if (cakeSumPrice >= 1000) {
            cakeSumPrice *= 0.8;
            System.out.println("・特売期間開催中！1,000円以上ご購入の方に2割引いたします。" + cakeSumPrice + "円");            
        }

        // 消費税の計算を行い、加算する
        cakeSumPrice += (int)(cakeSumPrice * tax);
        System.out.println("お会計：税込" + cakeSumPrice + "円です。");
    }
}
