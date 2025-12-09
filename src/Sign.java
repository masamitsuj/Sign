public class Sign {
    private int width;
    private String mDisplayed;

    public Sign(String mDisplayed, int width)
    {
        this.mDisplayed = mDisplayed;
        this.width = width;
    }




    int numberOfLines()
    {
        int length = mDisplayed.length();
        if (length % width > 0) {
            return (length / width) + 1;
        }
        return (length / width);
    }


    String getLines()
    {
        if (mDisplayed.isEmpty()) return null;
        String Seperate = "";
        int lines = numberOfLines();

        for (int i = 0; i < lines; i++)
        {
            int start = i * width;
            int end = start + width;

            if (end > mDisplayed.length())
            {
                end = mDisplayed.length();
            }

            Seperate += mDisplayed.substring(start, end);

            if (i < lines - 1)
            {
                Seperate += ";";
            }
        }

        return Seperate;
    }
}