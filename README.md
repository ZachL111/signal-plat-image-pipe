# signal-plat-image-pipe

`signal-plat-image-pipe` explores platform engineering with a small Java codebase and local fixtures. The technical goal is to package a Java local lab for image analysis with append-only fixtures, checkpoint recovery checks, and documented operating limits.

## Problem It Tries To Make Smaller

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Signal Plat Image Pipe Review Notes

For a quick review, compare `secret scope` with `rollout width` before reading the middle cases.

## Working Pieces

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/signal-plat-image-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `secret scope` and `rollout width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Design Notes

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Example Run

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `recovery` is the high score at 221; `stale` is the low score at 124.

## Known Limits

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
