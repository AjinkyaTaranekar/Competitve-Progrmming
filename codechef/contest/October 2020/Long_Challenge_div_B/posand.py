import math
def isPower2(x):
	return (x and (not(x & (x - 1))))
test = int(input())
for t in range(test):
	n = int(input())
	if n==1:
		print(1)
	else:
		if isPower2(n):
			print(-1)
		else:
			l = []
			i = 2
			while(i<=n):
				if i==2:
					l.append(2)
					l.append(3)
					l.append(1)
					i+=2
				elif isPower2(i):
					l.append(i+1)
					l.append(i)
					i+=2
				else:
					l.append(i)
					i+=1
			print(*l)