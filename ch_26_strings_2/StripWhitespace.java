public class StripWhitespace {
    void main() {
        String message = "   Happy Valentines Day.   ";

        String messageStrip = message.strip() + "|";
        System.out.println(messageStrip);
        // Happy Valentines Day.|

        String messageStripLeading = message.stripLeading() + "|";
        System.out.println(messageStripLeading);
        // Happy Valentines Day.   |

        String messageStripTrailing = message.stripTrailing() + "|";
        System.out.println(messageStripTrailing);
        //   Happy Valentines Day.|
    }
}
