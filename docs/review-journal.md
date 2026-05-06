# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 129, lane `watch`
- `stress`: `quota pressure`, score 191, lane `ship`
- `edge`: `route drift`, score 193, lane `ship`
- `recovery`: `secret scope`, score 221, lane `ship`
- `stale`: `rollout width`, score 124, lane `watch`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
