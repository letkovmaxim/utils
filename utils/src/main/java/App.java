public class App {

    public static void main(String[] args) {
        ClassUtils.showInfo(new String());
    }
}

//OUTPUT:
//Пакет :
//    java.lang;
//Название класса :
//    String;
//Родитель класса :
//    Object;
//Интерфейсы класса :
//    Serializable;
//    Comparable;
//    CharSequence;
//    Constable;
//    ConstantDesc;
//Вложенные классы :
//    CaseInsensitiveComparator;
//Поля класса :
//    @Stable
//    private final byte[] value;
//    private final byte coder;
//    private int hash;
//    private boolean hashIsZero;
//    private static final long serialVersionUID;
//    static final boolean COMPACT_STRINGS;
//    private static final ObjectStreamField[] serialPersistentFields;
//    private static final char REPL;
//    public static final Comparator CASE_INSENSITIVE_ORDER;
//    static final byte LATIN1;
//    static final byte UTF16;
//        Конструкторы класса :
//    public java.lang.String(StringBuffer arg0);
//    public java.lang.String(StringBuilder arg0);
//    java.lang.String(char[] arg0, int arg1, int arg2, Void arg3);
//    java.lang.String(AbstractStringBuilder arg0, Void arg1);
//    public java.lang.String(byte[] arg0, int arg1, int arg2, Charset arg3);
//    public java.lang.String(byte[] arg0, String arg1);
//    public java.lang.String(byte[] arg0, Charset arg1);
//    public java.lang.String(byte[] arg0, int arg1, int arg2);
//    public java.lang.String(byte[] arg0);
//    java.lang.String(byte[] arg0, byte arg1);
//    public java.lang.String(char[] arg0, int arg1, int arg2);
//    public java.lang.String(char[] arg0);
//    public java.lang.String(String arg0);
//    public java.lang.String();
//    public java.lang.String(byte[] arg0, int arg1, int arg2, String arg3);
//    public java.lang.String(byte[] arg0, int arg1);
//    public java.lang.String(byte[] arg0, int arg1, int arg2, int arg3);
//    public java.lang.String(int[] arg0, int arg1, int arg2);
//Методы класса :
//    byte[] value();
//    public boolean equals(Object arg0);
//    public int length();
//    public String toString();
//    static void checkIndex(int arg0, int arg1);
//    public int hashCode();
//    public void getChars(int arg0, int arg1, char[] arg2, int arg3);
//    public volatile int compareTo(Object arg0);
//    public int compareTo(String arg0);
//    static int indexOf(byte[] arg0, byte arg1, int arg2, String arg3, int arg4);
//    public int indexOf(String arg0);
//    public int indexOf(String arg0, int arg1);
//    public int indexOf(int arg0, int arg1);
//    public int indexOf(int arg0);
//    public static String valueOf(int arg0);
//    public static String valueOf(boolean arg0);
//    public static String valueOf(char[] arg0, int arg1, int arg2);
//    public static String valueOf(char[] arg0);
//    public static String valueOf(char arg0);
//    public static String valueOf(Object arg0);
//    public static String valueOf(float arg0);
//    public static String valueOf(long arg0);
//    public static String valueOf(double arg0);
//    byte coder();
//    private static Void rangeCheck(char[] arg0, int arg1, int arg2);
//    static void checkBoundsOffCount(int arg0, int arg1, int arg2);
//    private static Charset lookupCharset(String arg0);
//    private static boolean isNotContinuation(int arg0);
//    private static char decode2(int arg0, int arg1);
//    private static int decodeUTF8_UTF16(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5);
//    private static int scale(int arg0, float arg1);
//    private static int decodeWithDecoder(CharsetDecoder arg0, char[] arg1, byte[] arg2, int arg3, int arg4);
//    private static String newStringNoRepl1(byte[] arg0, Charset arg1);
//    static String newStringUTF8NoRepl(byte[] arg0, int arg1, int arg2);
//    private static void throwMalformed(int arg0, int arg1);
//    private static void throwMalformed(byte[] arg0);
//    private static byte[] encodeUTF8(byte arg0, byte[] arg1, boolean arg2);
//    private static byte[] encode8859_1(byte arg0, byte[] arg1);
//    private static byte[] encode8859_1(byte arg0, byte[] arg1, boolean arg2);
//    private static byte[] encodeASCII(byte arg0, byte[] arg1);
//    private static byte[] encodeWithEncoder(Charset arg0, byte arg1, byte[] arg2, boolean arg3);
//    private static byte[] safeTrim(byte[] arg0, int arg1, boolean arg2);
//    private static byte[] encode(Charset arg0, byte arg1, byte[] arg2);
//    private static byte[] getBytesNoRepl1(String arg0, Charset arg1);
//    private static boolean isASCII(byte[] arg0);
//    private static void throwUnmappable(int arg0);
//    private static void throwUnmappable(byte[] arg0);
//    private static boolean isMalformed3(int arg0, int arg1, int arg2);
//    private static int malformed3(byte[] arg0, int arg1);
//    private static char decode3(int arg0, int arg1, int arg2);
//    private static boolean isMalformed3_2(int arg0, int arg1);
//    private static int decode4(int arg0, int arg1, int arg2, int arg3);
//    private static boolean isMalformed4(int arg0, int arg1, int arg2);
//    private static int malformed4(byte[] arg0, int arg1);
//    private static boolean isMalformed4_2(int arg0, int arg1);
//    private static boolean isMalformed4_3(int arg0);
//    private static byte[] encodeUTF8_UTF16(byte[] arg0, boolean arg1);
//    boolean isLatin1();
//    public char charAt(int arg0);
//    public int codePointAt(int arg0);
//    public int codePointBefore(int arg0);
//    public int codePointCount(int arg0, int arg1);
//    public int offsetByCodePoints(int arg0, int arg1);
//    static void checkBoundsBeginEnd(int arg0, int arg1, int arg2);
//    public byte[] getBytes(Charset arg0);
//    void getBytes(byte[] arg0, int arg1, byte arg2);
//    public byte[] getBytes(String arg0);
//    @Deprecated
//    public void getBytes(int arg0, int arg1, byte[] arg2, int arg3);
//    void getBytes(byte[] arg0, int arg1, int arg2, byte arg3, int arg4);
//    public byte[] getBytes();
//    public boolean contentEquals(CharSequence arg0);
//    public boolean contentEquals(StringBuffer arg0);
//    private boolean nonSyncContentEquals(AbstractStringBuilder arg0);
//    public boolean regionMatches(boolean arg0, int arg1, String arg2, int arg3, int arg4);
//    public boolean regionMatches(int arg0, String arg1, int arg2, int arg3);
//    public boolean startsWith(String arg0, int arg1);
//    public boolean startsWith(String arg0);
//    public int lastIndexOf(String arg0);
//    static int lastIndexOf(byte[] arg0, byte arg1, int arg2, String arg3, int arg4);
//    public int lastIndexOf(String arg0, int arg1);
//    public int lastIndexOf(int arg0, int arg1);
//    public int lastIndexOf(int arg0);
//    public String substring(int arg0, int arg1);
//    public String substring(int arg0);
//    public boolean isEmpty();
//    public String replace(char arg0, char arg1);
//    public String replace(CharSequence arg0, CharSequence arg1);
//    public boolean matches(String arg0);
//    public String replaceFirst(String arg0, String arg1);
//    public String replaceAll(String arg0, String arg1);
//    public String[] split(String arg0);
//    public String[] split(String arg0, int arg1);
//    public static transient String join(CharSequence arg0, CharSequence[] arg1);
//    @ForceInline
//    static String join(String arg0, String arg1, String arg2, String[] arg3, int arg4);
//    public static String join(CharSequence arg0, Iterable arg1);
//    public String toLowerCase();
//    public String toLowerCase(Locale arg0);
//    public String toUpperCase();
//    public String toUpperCase(Locale arg0);
//    public String trim();
//    public String strip();
//    public String stripLeading();
//    public String stripTrailing();
//    private int indexOfNonWhitespace();
//    public Stream lines();
//    public String repeat(int arg0);
//    private int lastIndexOfNonWhitespace();
//    private static int outdent(List arg0);
//    public boolean isBlank();
//    public char[] toCharArray();
//    public static transient String format(String arg0, Object[] arg1);
//    public static transient String format(Locale arg0, String arg1, Object[] arg2);
//    public volatile Object resolveConstantDesc(Lookup arg0);
//    public String resolveConstantDesc(Lookup arg0);
//    public IntStream codePoints();
//    static String newStringNoRepl(byte[] arg0, Charset arg1);
//    static byte[] getBytesUTF8NoRepl(String arg0);
//    static byte[] getBytesNoRepl(String arg0, Charset arg1);
//    static int decodeASCII(byte[] arg0, int arg1, char[] arg2, int arg3, int arg4);
//    public boolean equalsIgnoreCase(String arg0);
//    public int compareToIgnoreCase(String arg0);
//    public boolean endsWith(String arg0);
//    public CharSequence subSequence(int arg0, int arg1);
//    public String concat(String arg0);
//    public boolean contains(CharSequence arg0);
//    public String indent(int arg0);
//    public String stripIndent();
//    public String translateEscapes();
//    public IntStream chars();
//    public Object transform(Function arg0);
//    public transient String formatted(Object[] arg0);
//    public static String copyValueOf(char[] arg0, int arg1, int arg2);
//    public static String copyValueOf(char[] arg0);
//    public native String intern();
//    static void checkOffset(int arg0, int arg1);
//    static String valueOfCodePoint(int arg0);
//    public Optional describeConstable();
//    private static String lambda$stripIndent$3(int arg0, String arg1);
//    private static String lambda$indent$2(int arg0, String arg1);
//    private static String lambda$indent$1(String arg0);
//    private static String lambda$indent$0(String arg0, String arg1);



