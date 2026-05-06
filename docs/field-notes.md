# Field Notes

I would read this project from the data inward: cases first, implementation second.

The domain cases cover `rollout width`, `quota pressure`, `route drift`, and `secret scope`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` is the strongest case at 221 on `secret scope`. `stale` is the cautious anchor at 124 on `rollout width`.

The language-specific addition keeps the review model in a package class with direct assertions.
