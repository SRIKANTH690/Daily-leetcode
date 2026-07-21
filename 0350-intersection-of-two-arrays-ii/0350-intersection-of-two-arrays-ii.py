# class Solution:
#     def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
#           res = []

#         for num in nums1:
#             if num in nums2:
#                 res.append(num)
#                 num2.remove(num)

#         return res


class Solution:
    def intersect(self, nums1, nums2):
        result = []

        for num in nums1:
            if num in nums2:
                result.append(num)
                nums2.remove(num)

        return result