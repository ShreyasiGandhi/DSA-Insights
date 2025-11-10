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

## 💡 Sample Problem (Example)
### Remove Duplicates from Sorted Array

**Approach 1 (Two Pointer)**
- Use one pointer to track unique elements.
- If `nums[i] != nums[j]`, move the pointer and assign the new unique value.
- Return the count of unique elements.

**Code:**
```java
public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}

