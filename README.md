# MaxProfitFromStockTrading

Problem statement:
During yesterday's stock trading, your company's stocks rose and fell 
all day. You are provided a list of all of these values in the form of an array. 
You are to determine the largest profit a person could have made if they bought 
the stock at the lowest value and sold at the highest possible value in the rest 
of the day yesterday. 
 
Constraints:
- Your solution has to be efficient
- Stocks must be bought before being sold
 
Solution: 
- We assume that there are at least 2 or more data points in the list provided
- This list is provided in a simple data structure such as an array. This solution 
should be simple enough to be adapted for other data structures as well 
- We iterate over the array only once. Hence the Time Complexity is O(n) 
- For each element we keep a track of the current highest profit we have seen as well 
as the smallest stock value we have seen so far. These values get updated with each new 
element read if required
- We do not use any other data structure to keep track of these values, and hence the 
Space Complexity for the program is O(1).
- The solution works for the case when the stock prices do not change over a certain 
period of time
- If stock prices constantly only fall and never rise, the solution provides a 
negative value to signify the least loss 
