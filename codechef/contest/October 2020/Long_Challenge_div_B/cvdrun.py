test = int(input())
for t in range(test):
	n,k,x,y = map(int, input().split())
	s = set([x])
	length = 0
	while(len(s)!=length):
		length = len(s)
		x = (x+k)%n
		s.add(x)
	if y in s:
		print("YES")
	else:
		print("NO")