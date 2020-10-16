test = int(input())
for t in range(test):
	n,k = map(int, input().split())
	Q = list(map(int, input().split()))
	ans = 0
	count = 0
	for i in Q:
		i += count
		if i>=k:
			ans += 1
			count = (i-k)
		else:
			break
	ans += (count//k) + 1
	print(ans)