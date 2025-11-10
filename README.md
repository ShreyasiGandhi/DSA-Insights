# DSA-Insights
This repository contains my personal notes, intuitive approaches, and explanations for DSA problems — inspired by my own learnings, Scaler sessions, and various other sources.
# 🧠 DSA Insights & Approaches

This repository contains my personal notes, approaches, and explanations for DSA problems learned from my own intuitions, Scaler, and other sources.

---

## 📚 Topics Covered
- Arrays
- Strings
- Linked Lists
- Trees
- Graphs
- Dynamic Programming
- Sliding Window

---

## 🧩 Problem: Remove Duplicates from Sorted Array

---

### Approach 1: Brute Force
**Idea:**  
Compare each element with every other element and manually shift unique ones to the front.

**Steps:**
1. Loop through the array.
2. For every element, check if it already exists before.
3. Keep only unique elements.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

```java
public int removeDuplicatesBruteForce(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;

    int index = 0;
    for (int i = 0; i < n; i++) {
        boolean isDuplicate = false;
        for (int j = 0; j < i; j++) {
            if (nums[i] == nums[j]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            nums[index++] = nums[i];
        }
    }
    return index;
}
```

##Approach 2: Two Pointer (Optimized)
__Idea:__
Use two pointers — one for placing the next unique element, one for scanning the array.

Steps:

Keep i at the position of last unique element.

Move j to find a new unique element.

Replace nums[i+1] with nums[j].

Time Complexity: O(n)
Space Complexity: O(1)
```
public int removeDuplicatesTwoPointer(int[] nums) {
    if (nums.length == 0) return 0;

    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
```

##Approach 3: Using Set

__Idea:__
Use a Set to store only unique elements. Simple to write, but uses extra space.

Steps:

Add all elements into a LinkedHashSet (preserves order).

Copy elements back to the array.

Time Complexity: O(n)
Space Complexity: O(n)
```
import java.util.*;

public int removeDuplicatesUsingSet(int[] nums) {
    Set<Integer> set = new LinkedHashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int i = 0;
    for (int num : set) {
        nums[i++] = num;
    }
    return set.size();
}

```
Comparison Summary
Approach	Time	Space	Notes
Brute Force	O(n²)	O(1)	Easy but inefficient
Two Pointer	O(n)	O(1)	Best for sorted arrays
Using Set	O(n)	O(n)	Simpler code, extra space

