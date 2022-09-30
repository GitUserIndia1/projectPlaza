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





int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
