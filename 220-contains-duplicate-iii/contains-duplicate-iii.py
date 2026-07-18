class Solution:
    def containsNearbyAlmostDuplicate(self, nums: List[int], indexDiff: int, valueDiff: int) -> bool:
        if valueDiff < 0:
            return False

        buckets = {}
        width = valueDiff + 1

        for i in range(len(nums)):
            num = nums[i]

            bucket_id = num // width

            # Same bucket
            if bucket_id in buckets:
                return True

            # Previous bucket
            if (bucket_id - 1 in buckets and
                abs(num - buckets[bucket_id - 1]) <= valueDiff):
                return True

            # Next bucket
            if (bucket_id + 1 in buckets and
                abs(num - buckets[bucket_id + 1]) <= valueDiff):
                return True

            buckets[bucket_id] = num

            # Remove elements outside the sliding window
            if i >= indexDiff:
                old = nums[i - indexDiff]
                old_bucket = old // width
                del buckets[old_bucket]

        return False