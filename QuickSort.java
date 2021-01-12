// По возрастанию
    public static void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

// По убыванию
    public static void quickSort(int[] source, int leftBorder, int rightBorder){

        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(rightMarker - leftMarker) / 2];

        do{
            while(source[leftMarker] > pivot && leftMarker < rightBorder){
                leftMarker++;
            }

            while(source[rightMarker] < pivot && rightMarker > leftBorder){
                rightMarker--;
            }

            if (leftMarker <= rightMarker){
                if(leftMarker < rightMarker){
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while(leftMarker <= rightMarker);

        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
    }
