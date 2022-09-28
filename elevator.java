public int findMinimumDistance(int floor, int[][] area){
        if(isElevatorOnFloor(area[floor])){
            return 0;
        }
        int i = 1;
        int rowAbove = floor+i;
        int rowBelow = floor-i;
        while(isRowWithinGridLimit(area.length, rowAbove) || isRowWithinGridLimit(area.length, rowBelow)){
            if(isRowWithinGridLimit(area.length, rowAbove)){
                if (isElevatorOnFloor(area[rowAbove])){
                    return i;
                }
            }
            if(isRowWithinGridLimit(area.length, rowBelow)){
                if(isElevatorOnFloor(area[rowBelow])){
                    return i;
                }
            }
            i++;
            rowAbove = floor+i;
            rowBelow = floor-i;
        }
        return -1;
    }
