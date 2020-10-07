# Calendar Module

# Task
# You are given a date. Your task is to find what the day is on that date.

# Input Format
# A single line of input containing the space separated month, day and year, respectively, in
# format.
# Constraints
# Calendar Module
# Sample Code

# Output Format
# Output the correct day in capital letters.

# Sample Input
# 08 05 2015

# Sample Output
# WEDNESDAY

# Explanation
# The day on August was WEDNESDAY .

# Solution

    import calendar
    date=input().split()
    name=calendar.weekday(int(date[2]),int(date[0]),int(date[1]))
    if name==0:
        print('MONDAY')
    elif name==1:
        print('TUESDAY')
    elif name==2:
        print('WEDNESDAY')
    elif name==3:
        print('THURSDAY')
    elif name==4:
        print('FRIDAY')
    elif name==5:
        print('SATURDAY')
    elif name==6:
        print('SUNDAY')
