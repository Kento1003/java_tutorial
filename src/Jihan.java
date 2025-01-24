/*自動販売機プログラム
 * 演習
 * 内容
 * 投入された10円玉、50円玉、100円玉、500円玉の合計金額を以下のように表示する
 * 「ただいまの投入金額は（合計金額）円です」
 * 「1円玉」「5円玉」が投入された場合は合計金額に含めず、警告を表示する。
 * 効果としてふさわしくない値は合計金額に含めず、警告を表示する。
 */
class Jihan {
    public static void main(String[] args) {
        // 各々のお金の投入個数をカウントする。(金額ではない)
        int yen1 = 0;
        int yen5 = 0;
        int yen10 = 0;
        int yen50 = 0;
        int yen100 = 0;
        int yen500 = 0;

        // 投入できるお金の合計金額を数えるための変数
        int yenSum = 0;

        // 以下は投入されたことを確認するために使用する変数
        boolean isInYen1 = false;
        boolean isInYen5 = false;
        boolean isNotMoney = false;

        // メッセージ設定
        String yen1Message = "警告：1円玉は使えません";
        String yen5Message = "警告：5円玉は使えません";
        String noYenMessage = "警告：お金ではないものが入ってます。";
        // argsから受け取った配列をひとつづつ取り出し、格納する。
        for (int i = 0; i < args.length; i++) {
            // 何が投入されているかひとつづつ確認する。
            switch (Integer.parseInt(args[i])) {
                case 1:
                    yen1++;
                    isInYen1 = true;
                    break;
                case 5:
                    yen5++;
                    isInYen5 = true;
                    break;
                case 10:
                    yen10++;
                    break;
                case 50:
                    yen50++;
                    break;
                case 100:
                    yen100++;
                    break;
                case 500:
                    yen500++;
                    break;
                default:
                    System.out.println(args[i] + "は硬貨として適切な値ではありません。");
                    // 指定していないお金のようなものが投入された場合は、お金じゃないフラグをいれる。
                    isNotMoney = true;
                    break;
            }
        }

        // 投入できるお金の合計金額を計算する。
        yenSum = yen10 * 10 + yen50 * 50 + yen100 * 100 + yen500 * 500;

        // 投入されたお金(以外も含む)をもとにメッセージを表示する。
        if (isInYen1) {
            System.out.println(yen1Message);
        }
        if (isInYen5) {
            System.out.println(yen5Message);
        }
        if (isNotMoney) {
            System.out.println(noYenMessage);
        }
        System.out.println("ただいまの投入金額は" + yenSum + "円です");
    }
}
